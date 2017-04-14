package by.htp.Lesson7.equipment.domain;

import by.htp.Lesson7.equipment.domain.RentStation;

public class Manager extends RentStation {

	private String nameManager;
	private int idManager;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idManager;
		result = prime * result + ((nameManager == null) ? 0 : nameManager.hashCode());
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
		Manager other = (Manager) obj;
		if (idManager != other.idManager)
			return false;
		if (nameManager == null) {
			if (other.nameManager != null)
				return false;
		} else if (!nameManager.equals(other.nameManager))
			return false;
		return true;
	}

	public String getNameManager() {
		return nameManager;
	}

	public void setNameManager(String nameManager) {
		this.nameManager = nameManager;
	}

	public int getIdManager() {
		return idManager;
	}

	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}

}
