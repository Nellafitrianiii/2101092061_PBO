/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nellaa.model;

import java.util.List;

/**
 *
 * @author Asus
 */
public interface AnggotaDao {
    nella.model.Anggota save (nella.model.Anggota anggota);
    nella.model.Anggota Update (int index, nella.model.Anggota anggota);
    void delete (int index);
    nella.model.Anggota getAnggota (int index);
    List <nella.model.Anggota> getAllAnggota();

    public void save(Anggota anggota);
}
