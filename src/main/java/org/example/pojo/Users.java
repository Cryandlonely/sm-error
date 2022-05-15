package org.example.pojo;


public class Users {

  private int userid;
  private String uname;
  private String upass;

  @Override
  public String toString() {
    return "Users{" +
            "userid=" + userid +
            ", uname='" + uname + '\'' +
            ", upass='" + upass + '\'' +
            '}';
  }

  public Users(int userid, String uname, String upass) {
    this.userid = userid;
    this.uname = uname;
    this.upass = upass;
  }

  public Users() {
  }

  public long getUserid() {
    return userid;
  }

  public void setUserid(int userid) {
    this.userid = userid;
  }


  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }


  public String getUpass() {
    return upass;
  }

  public void setUpass(String upass) {
    this.upass = upass;
  }

}
