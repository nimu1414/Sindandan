package model;

import java.util.List;

import DAO.SindansDAO;

public class GetSindanListLogic {
	public List<Sindan> execute(){
		SindansDAO dao = new SindansDAO();
		List<Sindan> mutterList = dao.findAll();
		return mutterList;
	}
}
