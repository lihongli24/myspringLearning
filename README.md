  在调用AbstractAutowireCapableBeanFactory.populateBean方法，往当前bean中注册属性的时候，有如下代码：
```
PropertyDescriptor[] filteredPds = filterPropertyDescriptorsForDependencyCheck(bw, mbd.allowCaching);
if (hasInstAwareBpps) {
	for (BeanPostProcessor bp : getBeanPostProcessors()) {
		if (bp instanceof InstantiationAwareBeanPostProcessor) {
			InstantiationAwareBeanPostProcessor ibp = (InstantiationAwareBeanPostProcessor) bp;
			pvs = ibp.postProcessPropertyValues(pvs, filteredPds, bw.getWrappedInstance(), beanName);
			if (pvs == null) {
				return;
			}
		}
	}
}
```
**==AutoWireAnnotationBeanPostProcessor==**就是其中的一个；
具体实现的功能，就是往当前的bean中注入@AutoWire标注的属性

```
graph TB
AutoWireAnnotationBeanPostProcessor.postProcessPropertyValues-->findAutowiringMetadata;
findAutowiringMetadata-->id{jj};
id{jj}-->|name|D;
id{jj}-->E;
E-->F;
D-->F;
```


```
graph TB
A[name]-->B[woca]
```

