package exception;

public class ExceptionEx4 {
    public static void main(String[] args) {
        // try~catch~finally
        try {
            // copyFile();
            System.out.println("예외 없음");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        }
    }

    static void copyFile() throws Exception {
        throw new Exception();
    }

    static void deleteTempFiles() {
        System.out.println("파일 삭제");
    }

}
