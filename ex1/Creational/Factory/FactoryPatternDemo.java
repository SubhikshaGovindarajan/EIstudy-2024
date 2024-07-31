// Product Interface
interface Notification {
    void send(String message);
}

// Concrete Products
class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email with message: " + message);
    }
}

class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}

class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending push notification with message: " + message);
    }
}

// Factory Interface
interface NotificationFactory {
    Notification createNotification();
}

// Concrete Factories
class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

class SMSNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}

class PushNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}

// Main Class
public class FactoryPatternDemo {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        NotificationFactory smsFactory = new SMSNotificationFactory();
        NotificationFactory pushFactory = new PushNotificationFactory();

        Notification emailNotif = emailFactory.createNotification();
        Notification smsNotif = smsFactory.createNotification();
        Notification pushNotif = pushFactory.createNotification();

        emailNotif.send("Hello via Email!"); // Output: Sending email with message: Hello via Email!
        smsNotif.send("Hello via SMS!");     // Output: Sending SMS with message: Hello via SMS!
        pushNotif.send("Hello via Push!");   // Output: Sending push notification with message: Hello via Push!
    }
}
