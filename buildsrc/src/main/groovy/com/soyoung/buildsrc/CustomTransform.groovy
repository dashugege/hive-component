//package com.soyoung.buildsrc
//
//import org.apache.tools.ant.taskdefs.Transform
//
//import javax.xml.crypto.dsig.TransformException
//
//public class CustomTransform extends Transform {
//    public static final String TAG = "CustomTransform";
//
//    public CustomTransform() {
//        super();
//    }
//
//    @Override
//    public String getName() {
//        return "CustomTransform";
//    }
//
//    @Override
//    public void transform(TransformInvocation transformInvocation) throws TransformException, InterruptedException, IOException {
//        super.transform(transformInvocation);
//        //当前是否是增量编译
//        boolean isIncremental = transformInvocation.isIncremental();
//        //消费型输入，可以从中获取jar包和class文件夹路径。需要输出给下一个任务
//        Collection<TransformInput> inputs = transformInvocation.getInputs();
//        //引用型输入，无需输出。
//        Collection<TransformInput> referencedInputs = transformInvocation.getReferencedInputs();
//        //OutputProvider管理输出路径，如果消费型输入为空，你会发现OutputProvider == null
//        TransformOutputProvider outputProvider = transformInvocation.getOutputProvider();
//        for (TransformInput input : inputs) {
//            for (JarInput jarInput : input.getJarInputs()) {
//                File dest = outputProvider.getContentLocation(
//                        jarInput.getFile().getAbsolutePath(),
//                        jarInput.getContentTypes(),
//                        jarInput.getScopes(),
//                        Format.JAR);
//                //将修改过的字节码copy到dest，就可以实现编译期间干预字节码的目的了
//                FileUtils.copyFile(jarInput.getFile(), dest);
//            }
//            for (DirectoryInput directoryInput : input.getDirectoryInputs()) {
//                File dest = outputProvider.getContentLocation(directoryInput.getName(),
//                        directoryInput.getContentTypes(), directoryInput.getScopes(),
//                        Format.DIRECTORY);
//                //将修改过的字节码copy到dest，就可以实现编译期间干预字节码的目的了
//                FileUtils.copyDirectory(directoryInput.getFile(), dest);
//            }
//        }
//    }
//
//    @Override
//    public Set<QualifiedContent.ContentType> getInputTypes() {
//        return TransformManager.CONTENT_CLASS;
//    }
//
//    @Override
//    public Set<? super QualifiedContent.Scope> getScopes() {
//        return TransformManager.SCOPE_FULL_PROJECT;
//    }
//
//    @Override
//    public Set<QualifiedContent.ContentType> getOutputTypes() {
//        return super.getOutputTypes();
//    }
//
//    @Override
//    public Set<? super QualifiedContent.Scope> getReferencedScopes() {
//        return TransformManager.EMPTY_SCOPES;
//    }
//
//    @Override
//    public Map<String, Object> getParameterInputs() {
//        return super.getParameterInputs();
//    }
//
//    @Override
//    public boolean isCacheable() {
//        return true;
//    }
//
//    @Override
//    public boolean isIncremental() {
//        return true; //是否开启增量编译
//    }
//}