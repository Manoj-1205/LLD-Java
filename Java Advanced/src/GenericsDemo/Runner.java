package GenericsDemo;

public class Runner {
    public static void main(String[] args) {
        //Generics is way to allow class to accept different data types in a single data type.
        AddData addData = new AddData(true, "Manoj");
        System.out.println(addData.getId()+" "+addData.getName());
    }
}
