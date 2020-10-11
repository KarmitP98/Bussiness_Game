/**
 *
 */
package System;

/**
 * @author Karmit
 *
 */
public class Manager {

	private String mName;
	private String mEmail;
	private int mId;
	private String mPassword;

	public Manager(String mName, String mEmail, int mId, String mPassword) {
		this.mName = mName;
		this.mEmail = mEmail;
		this.mId = mId;
		this.mPassword = mPassword;
	}

	/**
	 *
	 */
	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getPassword() {
		return mPassword;
	}

	public void setPassword(String password) {
		this.mPassword = password;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmEmail() {
		return mEmail;
	}

	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}

	@Override
	public String toString() {
		return "Manager{" +
				"mName='" + mName + '\'' +
				", mEmail='" + mEmail + '\'' +
				", mId=" + mId +
				", password='" + mPassword + '\'' +
				'}';
	}
}
