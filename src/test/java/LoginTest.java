public class LoginTest {

    public static void loginTest() {
        openApplication();
        System.out.println("Attempting login with incorrect credentials");
    }

//    @Override
    protected static void openApplication() {
        System.out.println("Opening browser");
        System.out.println("Opening app URL");
    }
}
