package lv.digitalbear.webapplication.domen;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

public enum Role {
	ROLE_ADMIN,
	ROLE_USER,
	ROLE_MANAGER
}
