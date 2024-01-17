package mone.schedule.scheduler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.SchedulerException;

import mone.common.conf.ConfigManager;
import mone.common.conf.ConstDef;
import mone.common.conf.ConstDef.EnumDateFormat;
import mone.common.util.Utils;
import mone.db.dao.PrcsDAO;
import mone.db.dao.AnsimApiPrcsDAO;
import mone.db.dto.AnsimApiReqDTO;
import mone.schedule.job.AnsimApiJob;



/**
 * 연계 api별 스케쥴링
 * @author iby
 *
 */
public class AnsimApiScheduleManager {
	// 로그
	private static final Logger logger = LogManager.getLogger(ScheduleManager.class);


	public static List<AnsimApiReqDTO> _ansimTargetList;

	// API 연계 스케쥴 실행 여부
	private String ansimApi;


	/**
	 * constructor
	 */
	public AnsimApiScheduleManager() {
	}

	/**
	 * initialize
	 * @throws Exception
	 */
	@SuppressWarnings("static-access")
	public void init() throws Exception {

		this.ansimApi = ConfigManager.getProps("ansimApi.schedule.onoff");

	}

	/**
	 *
	 * @return
	 * @throws SchedulerException
	 */
	public void start() throws SchedulerException {
		// 스케쥴 크론 표현식
		String cronExpr = "";

		// 스케쥴 job name
		String jobNm = "";

		// 스케쥴 cron trigger name
		String cronTriggerNm = "";

		// 스케쥴 group
		String group = "";


			logger.info(String.format("[스케쥴링ON/OFF] 안심확인제 API 연계 :%s", ansimApi));

			if(ConstDef.OnOff.ON.equals(ansimApi) == true) {
				cronExpr = ConfigManager.getProps("ansimaApi.cron.rule");
				jobNm = ConfigManager.getProps("ansimaApi.job.name");
				cronTriggerNm = ConfigManager.getProps("ansimaApi.crontrigger.name");
				group = ConfigManager.getProps("ansimaApi.schedule.group");

				//API 연계 스케쥴러 시작
				try {
					System.out.println(" ::::::::::::::::  ansim API Start ::::::: ");
					QuartzCronScheduler.getInstance().schedule(AnsimApiJob.class, cronExpr, jobNm, cronTriggerNm, group);
				} catch (Exception e) {
					System.out.println("Exception Message :: >>>>>>>> :: "  + e.getMessage() );
				}

			}


			if(ConstDef.OnOff.ON.equals(ansimApi) == false   ) {
				logger.warn("설정파일확인.. 연계 대상 API 플래그 모두 OFF");
				return;
			} else {
				logger.info("start schedule!");
				QuartzCronScheduler.getInstance().start();
			}

	}




}
