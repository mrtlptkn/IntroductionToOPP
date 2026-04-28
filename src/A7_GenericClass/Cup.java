package A7_GenericClass;

// T herhangi bir tip,
// Cup bizim dışarıdan tanımlayacağımız tip ile çalışan bilen bir sınıf


public class Cup<T> {
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
