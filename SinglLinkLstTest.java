import java.util.Iterator;

public class SinglLinkLstTest {
    public static void main (String[] args){
        SinglLinkLst<String> courses = new SinglLinkLst<>();
        Iterator<String> courseIt = courses.LLIterator();
        while(courseIt.hasNext()){
            String data = courseIt.next();
        }
    }
}