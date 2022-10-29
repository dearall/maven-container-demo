package org.codehaus.plexus.examples.tutorial.container;

import org.codehaus.plexus.DefaultPlexusContainer;
import org.codehaus.plexus.PlexusContainer;

public class App {
    public static void main(String args[]) throws Exception
    {
        // 1  定义一个容器，容器会去加载classpath下的META-INF/Plexus/component.xml中的组件
        PlexusContainer container= new DefaultPlexusContainer();

        // 2 获取组件，完成依赖注入等工作
        Cheese cheese = (Cheese) container.lookup( Cheese.ROLE, "parmesan" );

        // 3 使用组件
        System.out.println( "Parmesan is " + cheese.getAroma() );

        // 4 销毁容器
        container.dispose();
    }
}
