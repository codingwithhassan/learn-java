<?php

/*

    Conclusion: 
    Self and static refer calling class object not parent class


    self::property   --> quick binding with current class may be parent
    static           --> late static bindings


*/


/**
*  But different case when creating object with new keyword
*/
class A {
public static function get_self() {
    return new self();
}

public static function get_static() {
    return new static();
}
}

class B extends A {}

echo get_class(B::get_self());  // A
echo get_class(B::get_static()); // B
echo get_class(A::get_self()); // A
echo get_class(A::get_static()); // A

// ------------------------------------------------------------------------------------

class StaticAndSelf{
    public function test()
    {
        return self::class;
    }
}

class StaticAndSelf2{
    public function test()
    {
        return static::class;
    }
}

trait Test{
    function test2()
    {
        return self::class;
    }
}

class StaticAndSelf3 extends StaticAndSelf2{
    use Test;
}

$first = new StaticAndSelf();
$second = new StaticAndSelf2();
$third = new StaticAndSelf3();

var_dump($first->test());
var_dump($second->test());
var_dump($third->test());
var_dump($third->test2());

/** 
    OUTPUT:

    string(13) "StaticAndSelf"
    string(14) "StaticAndSelf2"
    string(14) "StaticAndSelf3"
    string(14) "StaticAndSelf3"
*/