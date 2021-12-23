package com.domain.Controllers;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "datamahasiswa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "datamahasiswa.findAll", query = "SELECT m FROM datamahasiswa m"),
    @NamedQuery(name = "datamahasiswa.findByNim", query = "SELECT m FROM datamahasiswa m WHERE m.Nim = :Nim"),
    @NamedQuery(name = "datamahasiswa.findByNama", query = "SELECT m FROM datamahasiswa m WHERE m.Nama = :Nama"),
    @NamedQuery(name = "datamahasiswa.findByAlamat", query = "SELECT m FROM datamahasiswa m WHERE m.Alamat = :Alamat"),
    @NamedQuery(name = "datamahasiswa.findByProgramstudi", query = "SELECT m FROM datamahasiswa m WHERE m.ProgramStudi = :ProgramStudi"),
    @NamedQuery(name = "datamahasiswa.findByFakultas", query = "SELECT m FROM datamahasiswa m WHERE m.Fakultas = :Fakultas")})
public class datamahasiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Nim")
    private String Nim;
    @Column(name = "Nama")
    private String Nama;
    @Column(name = "Alamat")
    private String Alamat;
    @Column(name = "ProgramStudi")
    private String ProgramStudi;
    @Column(name = "Fakultas")
    private String Fakultas;

    public datamahasiswa() {
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String nim) {
        this.Nim = nim;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        this.Alamat = alamat;
    }

    public String getProgramstudi() {
        return ProgramStudi;
    }

    public void setProgramstudi(String programstudi) {
        this.ProgramStudi = programstudi;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String fakultas) {
        this.Fakultas = fakultas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (Nim != null ? Nim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof datamahasiswa)) {
            return false;
        }
        datamahasiswa other = (datamahasiswa) object;
        if ((this.Nim == null && other.Nim != null) || (this.Nim != null && !this.Nim.equals(other.Nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.domain.Controllers.datamahasiswa[ Nim=" + Nim + " ]";
    }
    
}