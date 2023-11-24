package Pages;
// when we don't want to call all method from interface RBI, RBI1 then we use abstract keyword
// using abstract keyword we have option to choose how many method we want to implement from interfaces
// whereas in interfaces we have to implements all the methods otherwise interface won't work.
// we can not create object of abstract class, we can call abstract class via inheritance(parent-child class)
// THis class is abstract parent class implementing interfaces and we are calling this class in child class via
// inheritance using extends keyword, in that case we can access whatever available in parent class.
public abstract class ParentsClass implements RBI1, RBI
{

// not using 100% methods from interface here

    @Override// we are implementing only one method from interface
    public void save() {

    }
}
