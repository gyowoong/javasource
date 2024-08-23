package classtest;

public class Tv {
    // 속성 => 변수
    private int channel; // 채널 : 번호
    private boolean power; // 전원여부 : true(on) / false(off)
    private String company; // 재조사 : 삼성, LG

    // 생성자
    // 클래스 이름과 동일(){}
    // 생성자 오버로딩(하나의 클래스에 생성자가 여러개 존재)
    Tv() {
        // default 생성자(괄호안에 아무것도 없는 것)
    }

    // this => 내가 가지고 있는 것(소유)
    Tv(int channel, boolean power, String company) {
        this.channel = channel;
        this.power = power;
        this.company = company;
    }

    // 전원을 켠다/끈다
    void power() {
        this.power = !this.power;
    }

    // 채널 올린다 / 내린다
    void channelUp() {
        this.channel++;
    }

    void channelDown() {
        this.channel--;
    }

    // set로 시작하는 메소드는 setter 메소드임

    // get로 시작하는 메소드는 getter 메소드임
    public int getChannel() {
        // return => channel 값 보낼께(메소드가 호출해주면)
        return channel;
    }

    public String getCompany() {
        return company;
    }

    public boolean isPower() {
        return power;
    }

}
