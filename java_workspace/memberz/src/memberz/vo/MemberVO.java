//VO ; Value Object
//- 하나의 클래스에 존재하는 여러가지 데이터 형의 집합
//- 저장된 데이터를 다른 곳으로 전달하기 위해 고안

//Value Object Design Pattern
//- 데이터베이스에서 쿼리한 데이터 저장에 유용
//- 매개변수나 반환값으로 대량의 데이터 처리
//- 데이터는 외부에서 직접 접근 불가
//  - 멤버 필드는 private로 선언
//  - public으로 getter/setter 메서드를 정의하여
//    데이터 액세스
//    - 변수 이름의 prefix로 set/get을 사용
package memberz.vo;

import java.util.Date;

// ID, PW, NAME, EMAIL, PHOTO, GENDER, JOINDATE
public class MemberVO {
    private String id;
    private String pw;
    private String name;
    private String email;
    private String photo;
    private String gender;
    private Date joinDate;

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }


    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoto() {
        return photo;
    }

    public String getGender() {
        return gender;
    }

    public Date getJoinDate() {
        return joinDate;
    }
}
