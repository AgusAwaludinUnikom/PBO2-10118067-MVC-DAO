/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.agus.latihanmvcdao.event;

import edu.agus.latihanmvcdao.entity.Pelanggan;
import edu.agus.latihanmvcdao.model.PelangganModel;

/**
 *	
 * @author
 * Nama     : Agus Awaludin
 * Nim      : 10118067
 * Kelas    : PBO2
 * 
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onUpdate(Pelanggan pelanggan);
    
    public void onDelete();
    
}
