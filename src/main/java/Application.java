import entity.Human;
import entity.Medicine;
import entity.Virus;
import org.hibernate.Session;
import util.HibernateUtil;

public class Application {
    public static void main(String[] args) {

        Human human1 = Human.builder().name("human1").build();
        Human human2 = Human.builder().name("human2").build();
        Human human3 = Human.builder().name("human3").build();

        Medicine medicine1 = Medicine.builder().name("medicine1").build();
        Medicine medicine2 = Medicine.builder().name("medicine2").build();
        Medicine medicine3 = Medicine.builder().name("medicine3").build();

        Virus virus1 = Virus.builder().name("virus1").human(human1).medicine(medicine1).build();
        Virus virus2 = Virus.builder().name("virus2").human(human2).medicine(medicine2).build();
        Virus virus3 = Virus.builder().name("virus3").human(human3).medicine(medicine3).build();
        Virus virus4 = Virus.builder().name("virus4").human(human2).medicine(medicine2).build();
        Virus virus5 = Virus.builder().name("virus5").human(human3).medicine(medicine1).build();


        saveOrUpdate(human1);
        saveOrUpdate(human2);
        saveOrUpdate(human3);

        saveOrUpdate(medicine1);
        saveOrUpdate(medicine2);
        saveOrUpdate(medicine3);

        saveOrUpdate(virus1);
        saveOrUpdate(virus2);
        saveOrUpdate(virus3);
        saveOrUpdate(virus4);
        saveOrUpdate(virus5);
    }
    public static <T> T saveOrUpdate(T entity) {
        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.saveOrUpdate(entity);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        return entity;
    }
}
