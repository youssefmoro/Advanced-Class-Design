import com.sun.org.apache.xml.internal.utils.StringToStringTable;

// toString
public class Hippo {
    private  String name0;
    private  String name1;
    private  String name2;
    private  String name3;
    private int weight;
    public Hippo (String name0,String name1,String name2,String name3,int weight)
    {
        this.name0=name0;
        this.name1=name1;
        this.name2=name2;
        this.name3=name3;
        this.weight=weight;
    }
    @Override
    public String toString()
    {
        //return name0;
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }
    public static void main(String[] args)
    {
        Hippo h=new Hippo("ALEX","HARRY","GARRY","BUDDY",(int)550);
        System.out.println(h);
        System.out.println(h.weight);

    }
}

