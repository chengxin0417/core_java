package core_java.modifier.abstract_class.template_design;

/**
 * 模拟汽车生产平台
 * @author yinchu
 *
 */
public abstract class CarPlatform {
	
	protected abstract void setupEngine();
	
	protected abstract void  setupGearbox();
	
	public void makeCar() {
		System.out.println("生产汽车骨架...");
		setupEngine();
		setupGearbox();
	}
	
}
