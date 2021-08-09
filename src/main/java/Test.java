import com.foxminded.TaskUniqueChar.CharCounter;
import com.foxminded.TaskUniqueChar.catche.Memory;
import com.foxminded.TaskUniqueChar.format.Formatter;
import com.foxminded.TaskUniqueChar.logic.UniqueCharCounter;

public class Test {
    public static void main(String[] args) throws IllegalAccessException {
	CharCounter charCount = new CharCounter(new Memory(), new UniqueCharCounter(), new Formatter());    
	System.out.print(charCount.showNumberOfCharacters("some", "some1", "some", "some1"));	
    }
    
}
