import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.commons.lang3.builder.EqualsBuilder;


public class Lion {
    private int idNumber;
    private int age;
 private String name;
public Lion(int idNumber, int age, String name) {
         this.idNumber = idNumber;
        this.age = age;
         this.name = name;
}
//    @Override public boolean equals(Object obj) {
//        return EqualsBuilder.reflectionEquals(this, obj);
//    }

    //real world scenario using apache but for specific elements chosen by you
    @Override public boolean equals(Object obj) {
    if ( !(obj instanceof Lion)) return false;
    Lion other = (Lion) obj;
    return new EqualsBuilder().appendSuper(super.equals(obj))
            .append(idNumber, other.idNumber)
            .append(age, other.age)
            .append(name, other.name)
            .isEquals();
}
// @Override public boolean equals(Object obj) {
//         if ( !(obj instanceof Lion)) return false;
//         Lion otherLion = (Lion) obj;
//         return ((this.idNumber == otherLion.idNumber)||(this.name==otherLion.name));
//         }
    public enum Week
{
    SATURDAY,SUNDAY,MONDAY,TUESDAY,WENDESDAY,THURSDAY,FRIDAY
}
    public enum Season {
        WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
        private String expectedVisitors;
        private Season(String expectedVisitors) {
            this.expectedVisitors = expectedVisitors;
        }
        public void printExpectedVisitors() {
            System.out.println(expectedVisitors);
        }
    }
    public enum OnlyOne {
        ONCE (true);
        private OnlyOne(boolean b) {
            System. out .println("constructing");
        }
        }
        public enum season2
        {
            WINTER{public void printHours(){System.out.println("9-7");}},
            SUMMER{public void printHours(){System.out.println("9-5");}},
            FALL{public void printHours(){System.out.println("9-3");}},
            SPRING{public void printHours(){System.out.println("9-4");}};
            public abstract void printHours();
        }
    public enum season3
    {
        WINTER{public void printHours(){System.out.println("9-7");}},
        SUMMER{public void printHours(){System.out.println("9-5");}},
        FALL,
        SPRING;
        public void printHours(){System.out.println("9-2.5");};
    }
        public static void main(String[] args)
    {
        Lion h=new Lion(150,23,"GARRY");
        Object f=new Lion(150,23,"GARRY");
        System.out.println(h.equals(f));
        System.out.println(h.age);
        for (Week week:Week.values())
        {
            System.out.println("day: "+week+" ,"+(week.ordinal()+1));
        }
        System.out.println(Week.FRIDAY.ordinal());
        System.out.println(Week.FRIDAY);
        Season.SUMMER.printExpectedVisitors();
        System.out.println(Season.SUMMER.expectedVisitors);
        OnlyOne firstCall=OnlyOne.ONCE;
        OnlyOne secondCall=OnlyOne.ONCE;
        season2.SPRING.printHours();
        season3.WINTER.printHours();//THE WINTER ONE
        season3.SPRING.printHours();//THE GENERAL ONE
    }
}

