import java.util.Arrays;
import java.util.PrimitiveIterator;

public class MyList<E> {
    private int size = 0;
    private static int DEFAUL_CAPACITY = 10;
    private Object[] element;

    public MyList() {
        element = new Object[DEFAUL_CAPACITY];
    }
//     Cài đặt phương thức ensureCapa()
//
//Mục đích: Tăng gấp đôi kích thước mảng chứa các phần tử
    private void ensureCapa(){
        int newSize = element.length*2;
        element = Arrays.copyOf(element, newSize);
    }
    // cài đặt phương thức add để thêm 1 phần tử vào cuối của danh sách
    //có tham so đầu vào là phần tử cần thêm vào danh sách.
    public void add(E e){
        if(size == element.length){
            ensureCapa();
        }
        element[size++] = e;
    }
//     Cài đặt phương thức get()
//Mục đích: Phương thức get() trả về phần tử vừa ở vị trí thứ i trong danh sách.
//Tham số đầu vào: số nguyên chứa vị trí cần truy cập đến phần tử trong danh sách
    public E get(int i){
        if ( i >= size || i < 0){
            throw  new IndexOutOfBoundsException("index: "+ i + ", size" + i);
        }
        return (E) element[i];
    }



}