package cn.livedoor.security.sysguard.graphtool;

import static org.rrd4j.ConsolFun.AVERAGE;

import java.awt.Color;
import java.util.Random;

import org.apache.log4j.Logger;
import org.rrd4j.DsType;
import org.rrd4j.core.RrdDb;
import org.rrd4j.core.RrdDef;
import org.rrd4j.core.Sample;
import org.rrd4j.core.Util;
import org.rrd4j.graph.RrdGraph;
import org.rrd4j.graph.RrdGraphDef;

public class RrdTools {

	private static Logger log = Logger.getLogger(RrdTools.class);

	public static boolean createRrdDatabase(String hostIp) {
		log.info("create rrd database file start");
		try {
			RrdDef rrdDef = new RrdDef(hostIp + ".rrd", Util.getTimestamp(),
					300);
			rrdDef.addDatasource("cpu", DsType.GAUGE, 600, 0, 100);
			rrdDef.addDatasource("mem", DsType.GAUGE, 600, 0, 100);
			rrdDef.addDatasource("disk", DsType.GAUGE, 600, 0, 100);
			rrdDef.addDatasource("load", DsType.GAUGE, 600, 0, 5);
			rrdDef.addDatasource("apptime", DsType.GAUGE, 600, 0, 600);
			rrdDef.addArchive(AVERAGE, 0.5, 1, 600);
			rrdDef.addArchive(AVERAGE, 0.5, 6, 700);
			rrdDef.addArchive(AVERAGE, 0.5, 24, 775);
			rrdDef.addArchive(AVERAGE, 0.5, 288, 797);
			new RrdDb(rrdDef);
			log.info("create rrd database file success");
		} catch (Exception e) {
			log.info("create rrd database file failure by : " + e.getMessage());
			return false;
		}
		return true;
	}

	public static boolean updateRrdData(String hostIp, Double cpu, Double mem,
			Double disk, Double load, Double apptime) {
		log.info("hostIp : " + hostIp + "  cpu value : " + cpu
				+ " mem value : " + mem + " disk value : " + disk
				+ " load value : " + load + " apptime value : " + apptime);
		try {
			log.info("update rrd database start");
			RrdDb rrdDb = new RrdDb(hostIp + ".rrd");
			Sample sample = rrdDb.createSample();
			long now = Util.getTimestamp();
			sample.setTime(now);
			sample.setValue("cpu", cpu);
			sample.setValue("mem", mem);
			sample.setValue("disk", disk);
			sample.setValue("load", load);
			sample.setValue("apptime", apptime);
			sample.update();
			rrdDb.close();
			log.info("update rrd database success");
		} catch (Exception e) {
			log.info("update rrd database failure , by " + e.getMessage());
			return false;
		}
		return true;
	}

	private static void createGraph(String hostIp) {
		try {

			log.info("create rrd graph start ");
			// day
			RrdGraphDef gDef_day = new RrdGraphDef();
			gDef_day.setWidth(600);
			gDef_day.setHeight(180);
			gDef_day.setFilename(hostIp + "-day.png");
			gDef_day.setStartTime(Util.getTimestamp("now -1day"));
			gDef_day.setEndTime(Util.getTimestamp());
			gDef_day.setTitle("system information");
			gDef_day.setVerticalLabel(hostIp);
			// gDef_day.datasource("mem", "mem.rrd", "mem", AVERAGE);
			// gDef_day.line("mem", Color.RED, "memory used");
			// gDef_day.datasource("cpu", "mem.rrd", "cpu", AVERAGE);
			// gDef_day.line("cpu", Color.BLUE, "cpu used");
			gDef_day.datasource("cpu", hostIp + ".rrd", "cpu", AVERAGE);
			gDef_day.datasource("mem", hostIp + ".rrd", "mem", AVERAGE);
			gDef_day.datasource("disk", hostIp + ".rrd", "disk", AVERAGE);
			gDef_day.datasource("load", hostIp + ".rrd", "load", AVERAGE);
			gDef_day.datasource("apptime", hostIp + ".rrd", "apptime", AVERAGE);
			gDef_day.datasource("loadview", "load,10,*");
			gDef_day.line("cpu", Color.GREEN, "cpu");
			gDef_day.line("mem", Color.YELLOW, "mem");
			gDef_day.line("disk", Color.BLUE, "disk");
			gDef_day.line("loadview", Color.ORANGE, "load");
			gDef_day.line("apptime", Color.RED, "apptime");

			gDef_day.setImageInfo("<img src='%s' width='%d' height = '%d'>");
			gDef_day.setPoolUsed(false);
			gDef_day.setImageFormat("png");
			// create graph finally
			new RrdGraph(gDef_day);
			// month
			RrdGraphDef gDef_month = new RrdGraphDef();
			gDef_month.setWidth(600);
			gDef_month.setHeight(180);
			gDef_month.setFilename(hostIp + "-month.png");
			gDef_month.setStartTime(Util.getTimestamp("now -1month"));
			gDef_month.setEndTime(Util.getTimestamp());
			gDef_month.setTitle("system information");
			gDef_month.setVerticalLabel(hostIp);
			gDef_month.datasource("cpu", hostIp + ".rrd", "cpu", AVERAGE);
			gDef_month.datasource("mem", hostIp + ".rrd", "mem", AVERAGE);
			gDef_month.datasource("disk", hostIp + ".rrd", "disk", AVERAGE);
			gDef_month.datasource("load", hostIp + ".rrd", "load", AVERAGE);
			gDef_month.datasource("apptime", hostIp + ".rrd", "apptime", AVERAGE);
			gDef_month.datasource("loadview", "load,10,*");
			gDef_month.line("cpu", Color.GREEN, "cpu");
			gDef_month.line("mem", Color.YELLOW, "mem");
			gDef_month.line("disk", Color.BLUE, "disk");
			gDef_month.line("loadview", Color.ORANGE, "load");
			gDef_month.line("apptime", Color.RED, "apptime");
			gDef_month.setImageInfo("<img src='%s' width='%d' height = '%d'>");
			gDef_month.setPoolUsed(false);
			gDef_month.setImageFormat("png");
			// create graph finally
			new RrdGraph(gDef_month);

			// year
			RrdGraphDef gDef_year = new RrdGraphDef();
			gDef_year.setWidth(600);
			gDef_year.setHeight(180);
			gDef_year.setFilename(hostIp + "-year.png");
			gDef_year.setStartTime(Util.getTimestamp("now -1year"));
			gDef_year.setEndTime(Util.getTimestamp());
			gDef_year.setTitle("system information");
			gDef_year.setVerticalLabel(hostIp);
			gDef_year.datasource("cpu", hostIp + ".rrd", "cpu", AVERAGE);
			gDef_year.datasource("mem", hostIp + ".rrd", "mem", AVERAGE);
			gDef_year.datasource("disk", hostIp + ".rrd", "disk", AVERAGE);
			gDef_year.datasource("load", hostIp + ".rrd", "load", AVERAGE);
			gDef_year.datasource("apptime", hostIp + ".rrd", "apptime", AVERAGE);
			gDef_year.datasource("loadview", "load,10,*");
			gDef_year.line("cpu", Color.GREEN, "cpu");
			gDef_year.line("mem", Color.YELLOW, "mem");
			gDef_year.line("disk", Color.BLUE, "disk");
			gDef_year.line("loadview", Color.ORANGE, "load");
			gDef_year.line("apptime", Color.RED, "apptime");
			gDef_year.setImageInfo("<img src='%s' width='%d' height = '%d'>");
			gDef_year.setPoolUsed(false);
			gDef_year.setImageFormat("png");
			// create graph finally
			new RrdGraph(gDef_year);
			log.info("create rrd graph success ");
		} catch (Exception e) {
			log.info("create rrd graph failure by :  " + e.getMessage());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// createRrdDatabase("192.168.1.3");
		while (true) {
			Random generator = new Random();
			int cpu = generator.nextInt(100) + 1;
			int mem = generator.nextInt(100) + 1;
			int disk = generator.nextInt(100) + 1;
			int load = generator.nextInt(2) + 1;
			int apptime = generator.nextInt(20) + 1;
			updateRrdData("192.168.1.3", new Double(cpu), new Double(mem),
					new Double(disk), new Double(load), new Double(apptime));
			createGraph("192.168.1.3");
			Thread.sleep(3000);
		}

	}

}
