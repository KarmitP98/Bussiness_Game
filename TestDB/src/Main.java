import java.sql.*;

public class Main {

    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\Java Programs\\TestDB\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "Contacts";
    public static final String COL_NAME = "Name";
    public static final String COL_PHONE = "Phone";
    public static final String COL_MAIL = "Mail";

    private static Connection con = null;
    private static Statement st = null;
    private static ResultSet resultSet = null;

    public static void main(String[] args) {

        try {
            con = DriverManager.getConnection(CONNECTION_STRING);
            st = con.createStatement();

            st.execute("DROP TABLE if EXISTS " + TABLE_CONTACTS);

            st.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    "(" + COL_NAME + " TEXT, " +
                    COL_PHONE + " INTEGER, " +
                    COL_MAIL + " TEXT)");

            insert("'Tim', 123456, 'tim@mail.com'");
            insert("'Joe', 654321, 'joe@mail.com'");
            insert("'Jane', 02468, 'jane@mail.com'");


            st.execute("SELECT * from " + TABLE_CONTACTS);
            resultSet = st.getResultSet();

            while (resultSet.next())
                System.out.println(resultSet.getString(COL_NAME) + "\t" + resultSet.getInt(COL_PHONE) + "\t" + resultSet.getString(COL_MAIL));

            resultSet.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
            e.printStackTrace();
        }

    }

    private static void insert(String str) {
        try {
            st.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COL_NAME + ", " + COL_PHONE + ", " + COL_MAIL + ") VALUES (" + str + ")");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

}
