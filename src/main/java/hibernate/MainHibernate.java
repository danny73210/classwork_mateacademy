package hibernate;

import org.hibernate.Session;

public class MainHibernate {
    public static void main(String[] args) {
        int id = createDevice();
        System.out.println(id);
        getDevice(id);
        HibernateUtil.shutdown();
    }

    public static Integer createDevice() {
        Device device = new Device("deviceName", "deviceColor", "deviceCompany");
        Session session = HibernateUtil.getSessionFactory().openSession();
        int id = (int) session.save(device);
        session.close();
        return id;
    }

    public static Device getDevice(int id) {
        System.out.println("First level cache example");
        Session session = HibernateUtil.getSessionFactory().openSession();
        Device device = session.load(Device.class, id);
        System.out.println(device.getColor());
        Device device1 = session.load(Device.class, id);
        System.out.println(device1.getColor());
        session.close();
        return device;
    }
}
