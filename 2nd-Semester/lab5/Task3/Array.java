public class Array {
    public boolean search(String item,String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].toLowerCase().equals(item.toLowerCase()))
                return true;
        }
        return false;
    }
}
