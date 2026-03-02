package dev.nelon.creational.singleton;

public class ProgramLogger {
	//	хранит единственный экземпляр
	private static volatile ProgramLogger programLogger;
	private static String logFile = "This is log file. \n\n";

	//	глобальная точка доступа
	public static synchronized ProgramLogger getProgramLogger() {
		//👉 Lazy Initialization Singleton
		// Объект создаётся только при первом вызове getProgramLogger().
		if (programLogger == null) {
			synchronized (ProgramLogger.class) {
				if (programLogger == null) {
					programLogger = new ProgramLogger();
				}
			}
		}
		return programLogger;
	}

	//	запрещает создание через new
	private ProgramLogger() {
	}

	public void addLogInfo(String logInfo) {
		logFile += logInfo + "\n";
	}

	public void showLogFile() {
		System.out.println(logFile);
	}
}
