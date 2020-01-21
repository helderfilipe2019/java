package designPatterns.behavioralPatterns.interpreter;

public class StringToBinaryExp implements IExpression {

	private String str;

	public StringToBinaryExp(String s) {

		str = s;
	}

	@Override
	public void interpret(Context ic) {
		ic.getBinaryForm(str);
	}

}
