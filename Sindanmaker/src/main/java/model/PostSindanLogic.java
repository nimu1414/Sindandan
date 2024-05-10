package model;

import DAO.SindansDAO;

public class PostSindanLogic {
		public void execute(Sindan sindan) {
			SindansDAO dao = new SindansDAO();
			dao.create(sindan);
		}
	}


