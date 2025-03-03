public class name {
    public String fName;
public String lName;
public String mName;

public name(String first,String last){
      fName = first;
      lName = last;
}
public name(String first,String mid,String last){
    mName = mid;
    fName = first;
    lName = last;
}

}
