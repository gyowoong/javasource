package inter;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl remoteControl = new Television();
        remoteControl.turnOn();
        remoteControl.setVolume(15);

        remoteControl = new Audio();
        remoteControl.turnOn();
        remoteControl.setVolume(5);
        remoteControl.turnOff();

        // 익명구현객체
        // Television,Audio 를 만들지 않는 경우
        remoteControl = new RemoteControl() {
            private int volume;

            @Override
            public void turnOn() {
                System.out.println("라디오를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("라디오를 끕니다.");
            }

            @Override
            public void setVolume(int volume) {
                if (volume > RemoteControl.MAX_VOLUME) {
                    this.volume = RemoteControl.MAX_VOLUME;
                } else if (volume < RemoteControl.MIN_VOLUME) {
                    this.volume = RemoteControl.MIN_VOLUME;
                } else {
                    this.volume = volume;
                }
                System.out.println("현재 라디오 볼륨 : " + volume);
            }
        };

        remoteControl.turnOn();
        remoteControl.turnOff();
    }

}
