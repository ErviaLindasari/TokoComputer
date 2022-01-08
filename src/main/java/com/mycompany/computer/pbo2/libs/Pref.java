package com.mycompany.computer.pbo2.libs;

import com.mycompany.computer.pbo2.model.Pengguna;
import java.util.prefs.Preferences;

public class Pref {
    public void simpan(Pengguna pengguna){
        Preferences preferences = Preferences.userNodeForPackage(Pref.class);
        preferences.putInt("id", pengguna.getId());
        preferences.put("username", pengguna.getUsername());
        preferences.put("nama_lengkap", pengguna.getNamaLengkap());
        preferences.putBoolean("is_admin", pengguna.isIsAdmin());
}

public Pengguna ambil(){
        Preferences preferences = Preferences.userNodeForPackage(Pref.class);
        
        Pengguna pengguna = new Pengguna();
        
        pengguna.setId(preferences.getInt("id",0));
        pengguna.setUsername(preferences.get("username", ""));
        pengguna.setNamaLengkap(preferences.get("nama_lengkap", ""));
        pengguna.setIsAdmin(preferences.getBoolean("is_admin", false));
        
        return pengguna;
        
    }
    
    public void hapus(){
        Preferences preferences = Preferences.userNodeForPackage(Pref.class);
        preferences.putInt("5F_id", 0);
        preferences.put("5F_username", "");
        preferences.put("5F_nama_lengkap", "");
        preferences.putBoolean("5F_is_admin", false);
    }
}
