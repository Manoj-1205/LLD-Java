public class Runner {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Manoj",12);
        System.out.println(pair.getLeft()+" "+pair.getRight());
//        System.out.println("After Swapping...");
//        Pair<Integer, String> swapPair = pair.swapValues(pair);
//        System.out.println(swapPair.getLeft()+" "+swapPair.getRight());

        //Disrupting the flow as it throws exception
        try {
            Pair<String, String> pair2 = new Pair<>(null, null);
            System.out.println(pair2.getLeft() + " " + pair2.getRight());
        }catch (LeftValueNullException le){
            System.out.println(le.getMessage());
        }catch (RightValueNullException re){
            System.out.println(re.getMessage());
        }catch (RuntimeException runtimeException){
            System.out.println("Runtime Exception found");
        }
        System.out.println("End line executed..");

    }

}
