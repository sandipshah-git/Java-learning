public class Box <T> {      // <T>  is a type parameter

    T item;  // T is a data type but don't know what is it exactly(string,int,or boolean)  so, it's generic

    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
}
