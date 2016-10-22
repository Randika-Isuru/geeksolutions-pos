package com.geeksolutions.pos.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "persistent_logins")
public class PersistentLogin implements Serializable {
	
	@Id
    private String series;
 
    @Column(name="USERNAME", unique=true, nullable=false)
    private String username;
     
    @Column(name="TOKEN", unique=true, nullable=false)
    private String token;
     
    @Temporal(TemporalType.TIMESTAMP)
    private Date last_used;
 
    public String getSeries() {
        return series;
    }
 
    public void setSeries(String series) {
        this.series = series;
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getToken() {
        return token;
    }
 
    public void setToken(String token) {
        this.token = token;
    }
 
    public Date getLast_used() {
        return last_used;
    }
 
    public void setLast_used(Date last_used) {
        this.last_used = last_used;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((last_used == null) ? 0 : last_used.hashCode());
		result = prime * result + ((series == null) ? 0 : series.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersistentLogin other = (PersistentLogin) obj;
		if (last_used == null) {
			if (other.last_used != null)
				return false;
		} else if (!last_used.equals(other.last_used))
			return false;
		if (series == null) {
			if (other.series != null)
				return false;
		} else if (!series.equals(other.series))
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PersistentLogin [series=" + series + ", username=" + username + ", token=" + token + ", last_used="
				+ last_used + "]";
	}
    

}
