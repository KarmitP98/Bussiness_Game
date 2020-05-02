package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {

    public static final String dbName = "music.db";
    public static final String connectionString = "jdbc:sqlite:D:\\Java Programs\\TestDB\\" + dbName;

    public static final String tableAlbum = "albums";
    public static final String colAlbumId = "_id";
    public static final String colAlbumName = "name";
    public static final String colAlbumArtist = "artist";

    public static final String tableArtists = "artists";
    public static final String colArtistId = "_id";
    public static final String colArtistName = "name";

    public static final String tableSongs = "songs";
    public static final String colSongTrack = "track";
    public static final String colSongTitle = "title";
    public static final String colSongAlbum = "album";
    public static final String colSongId = "_id";

    private Connection conn;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(connectionString);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void close() {
        try {
            if (conn != null)
                conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List queryArtists(int index) {
        Statement s = null;
        ResultSet resultSet = null;
        List list = new ArrayList<>();

        try {
            s = conn.createStatement();

            if (index == 0) {
                resultSet = s.executeQuery("SELECT * FROM " + tableArtists);
                while (resultSet.next()) {
                    Artist artist = new Artist();
                    artist.setId(resultSet.getInt(colArtistId));
                    artist.setName(resultSet.getString(colAlbumName));
                    list.add(artist);
                }
            } else if (index == 1) {
                resultSet = s.executeQuery("SELECT * FROM " + tableSongs);
                while (resultSet.next()) {
                    Song song = new Song();
                    song.setId(resultSet.getInt(colSongId));
                    song.setAlbumId(resultSet.getInt(colSongAlbum));
                    song.setName(resultSet.getString(colSongTitle));
                    song.setTrack(resultSet.getInt(colSongTrack));
                    list.add(song);
                }
            } else {
                resultSet = s.executeQuery("SELECT * FROM " + tableAlbum);
                while (resultSet.next()) {
                    Album album = new Album();
                    album.setId(resultSet.getInt(colAlbumId));
                    album.setName(resultSet.getString(colAlbumName));
                    album.setArtistId(resultSet.getInt(colAlbumArtist));
                    list.add(album);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {

            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (s != null)
                    s.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }


}
