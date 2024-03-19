package mone.schedule.scheduler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.SchedulerException;

import mone.common.conf.ConfigManager;
import mone.common.conf.ConstDef;
import mone.schedule.job.CollectData;

/**
 * 연계 api별 스케쥴링
 * 
 * @author iby
 *
 */
public class ScheduleManager {
	// 로그
	private static final Logger logger = LogManager.getLogger(ScheduleManager.class);

	// 스케쥴 실행 여부
	private String _getCollectDBScheduleOnOff;

	/**
	 * constructor
	 */
	public ScheduleManager() {
	}

	/**
	 * initialize
	 */
	public void init() {

		/*  */
		this._getCollectDBScheduleOnOff = ConfigManager.getProps("getTiberoSudoDB.schedule.onoff");

		/*  */
		if (ConstDef.OnOff.ON.equals(_getCollectDBScheduleOnOff) == true) {

		}

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

		// 국가수도처 db 접속하에 데이터 처리
		logger.info(String.format("[스케쥴링ON/OFF]  DB 수집 %s ", _getCollectDBScheduleOnOff));

		/* tibero db data select -> tibero SUDO db data insert 스케쥴 */
		if (ConstDef.OnOff.ON.equals(_getCollectDBScheduleOnOff) == true) {
			cronExpr = ConfigManager.getProps("getTiberoSudoDB.cron.rule");
			jobNm = ConfigManager.getProps("getTiberoSudoDB.job.name");
			cronTriggerNm = ConfigManager.getProps("getTiberoSudoDB.crontrigger.name");
			group = ConfigManager.getProps("getTiberoSudoDB.schedule.group");

			// Orcle db data select 스케쥴러 시작
			QuartzCronScheduler.getInstance().schedule(CollectData.class, cronExpr, jobNm, cronTriggerNm, group);
		}

		//
		if (ConstDef.OnOff.ON.equals(_getCollectDBScheduleOnOff) == false) {
			logger.warn("설정파일확인..   모두 OFF");
			return;
		} else {
			logger.info("start schedule!");
			QuartzCronScheduler.getInstance().start();
		}

	}

}
