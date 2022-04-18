package com.Group5.W10.model;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class karyawan  
{  
//deklaras id karyawan as primary key  
@Id  
@Column  
private  int id;  
@Column  
private String nama;  
@Column  
private String jabatan;  
@Column  
private int salary;  
public int getId()   
{  
return id;  
}  
public void setId(int id)   
{  
this.id = id;  
}  
public String getNama()  
{  
return nama;  
}  
public void setNama(String nama)   
{  
this.nama = nama;  
}  
public String getJabatan()   
{  
return jabatan;  
}  
public void setJabatan(String jabatan)   
{  
this.jabatan = jabatan;  
}  
public int getSalary()   
{  
return salary;  
}  
public void setSalary(int salary)   
{  
this.salary = salary;  
}  
}  