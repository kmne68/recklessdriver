/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kmne68.recklessdriver;

/**
 *
 * @author kemery
 */
public class GameObject {
    
    private boolean ebabled = false;
    private String name;
    private String tag;
    
    public final boolean isEbabled() {
        return ebabled;
    }

    public final void setEbabled(boolean ebabled) {
        this.ebabled = ebabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public void OnCollision(GameObject other) {
        // default behavior is to do nothing
    }

}
