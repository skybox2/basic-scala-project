package com.skylar.basicscalaproject

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

/**
  * Created by skylar on 4/11/17.
  */
class ApplicationTest extends FunSuite with BeforeAndAfter {

  before{
    //set up variables
  }

  test("dummyTest") {
    assert(true)
  }

  after {
    //tear down variables
  }

}
