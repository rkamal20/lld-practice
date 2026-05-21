package designpatterns.creational.singleton;

public class UserService {

    public void createUser() {       
        Logger logger = Logger.getInstance();
        logger.log("User created");

        //System.out.println(logger.hashCode());
    }
}
