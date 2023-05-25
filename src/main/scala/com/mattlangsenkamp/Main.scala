package com.mattlangsenkamp
import ai.djl.Device.gpu
import ai.djl.engine.Engine
import ai.djl.ndarray.types.{DataType, Shape}

@main
def main(): Unit =
  println(Engine.getInstance().getGpuCount)
  val manager = Engine.getInstance().newBaseManager()

  val x = manager.ones(new Shape(2, 3), DataType.FLOAT32, gpu())
  println(x)