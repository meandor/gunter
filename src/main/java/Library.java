import mware_lib.ObjectBroker;

/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'fawin' at '6/19/17 8:38 PM' with Gradle 2.11
 *
 * @author fawin, @date 6/19/17 8:38 PM
 */
public class Library {
    public boolean someLibraryMethod() {
        ObjectBroker broker = ObjectBroker.init("localhost", 2123, true);
        return true;
    }
}