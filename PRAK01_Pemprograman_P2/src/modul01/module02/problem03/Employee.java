package module02.problem03;

//Pada baris ini terjadi error karena nama class yang digunakan tidak sesuai dengan nama file yang disimpan (Employee.java)
//public class Pegawai {
public class Employee {
    public String name;

    //Pada baris ini akan terjadi error ketika data yang diminta seharusnya bertipe String (teks) sedangkan pada atribut bertipe char (karakter tunggal)
    //public char origin;
    public String origin;
    public String role;
    public int age;

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    //Pada baris ini terjadi error karena method setRole() tidak memiliki paramater (String r)
    //public void setRole() {
    public void setRole(String r) {
        this.role = r;
    }
}