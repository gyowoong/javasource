package extendstest;

public class CaptionTv extends Tv {
    private boolean caption;

    void displayCation(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

    public boolean isCaption() {
        return caption;
    }

    public void setCation(boolean caption) {
        this.caption = caption;
    }
}
