package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO{
	static String filePath = "F:/java/db/appliances_db.txt";

	@Override
	public List<Appliance> find(Criteria criteria) {
		List<String> linesWithParameters;
		List<Appliance> applianceList;

		//считываем и сохраняем в эррейлист строки, которые подошли нам по критериям поиска
		linesWithParameters = new ReadFileFindMatches().lineWithParam(criteria, filePath);

		//формируем строку из найденных приборов
		applianceList = new ApplianceToList().addApplianceToList(linesWithParameters, criteria);

		return applianceList;
	}




}


