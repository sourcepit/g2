package org.sourcepit.emfx.codegen.ecore.templates.generator;

import org.sourcepit.emfx.codegen.ecore.genmodel2.*;

public class BaseGeneratorAdapter
{
  protected static String nl;
  public static synchronized BaseGeneratorAdapter create(String lineSeparator)
  {
    nl = lineSeparator;
    BaseGeneratorAdapter result = new BaseGeneratorAdapter();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL;
  protected final String TEXT_3 = NL + NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */" + NL + "public abstract class ";
  protected final String TEXT_4 = " extends ";
  protected final String TEXT_5 = NL + "{";
  protected final String TEXT_6 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final String ";
  protected final String TEXT_7 = " = \"";
  protected final String TEXT_8 = "\";" + NL;
  protected final String TEXT_9 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_10 = "(";
  protected final String TEXT_11 = " generatorAdapterFactory)" + NL + "\t{" + NL + "\t\tsuper(generatorAdapterFactory);" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tprotected void addBaseTemplatePathEntries(";
  protected final String TEXT_12 = "<";
  protected final String TEXT_13 = "> templatePath) {" + NL + "\t\ttemplatePath.add(";
  protected final String TEXT_14 = ".INSTANCE.getBaseURL().toString()" + NL + "\t\t\t\t+ \"templates\");" + NL + "\t\tsuper.addBaseTemplatePathEntries(templatePath);" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tprotected void addClasspathEntries(";
  protected final String TEXT_15 = " jetEmitter)" + NL + "\t\t\tthrows ";
  protected final String TEXT_16 = " {" + NL + "\t\tjetEmitter.addVariable(\"EMF_CODEGEN\", \"org.eclipse.emf.codegen\");" + NL + "\t\tjetEmitter.addVariable(\"EMF_CODEGEN_ECORE\"," + NL + "\t\t\t\t\"org.eclipse.emf.codegen.ecore\");" + NL + "\t\tjetEmitter.addVariable(\"EMF_COMMON\", \"org.eclipse.emf.common\");" + NL + "\t\tjetEmitter.addVariable(\"EMF_ECORE\", \"org.eclipse.emf.ecore\");" + NL + "\t\t" + NL + "\t\tjetEmitter.addVariable(\"GENERATOR\", \"";
  protected final String TEXT_17 = "\");" + NL + "\t\tsuper.addClasspathEntries(jetEmitter);" + NL + "\t}" + NL + "}";
  protected final String TEXT_18 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    /**
 * <copyright>
 *
 * Copyright (c) Tim Baumgartner, 2009
 *
 * </copyright>
 */
    GenPackage2 genPackage     = (GenPackage2) argument;
    GenModel2   genModel       = genPackage.getGenModel();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(genPackage.getGeneratorPackageName());
    stringBuffer.append(TEXT_2);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(genPackage.getGeneratorAdapterBaseClassName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.codegen.ecore.generator.AbstractGeneratorAdapter"));
    stringBuffer.append(TEXT_5);
    for (String projectType : genModel.getGeneratorProjectTypes()) {
    stringBuffer.append(TEXT_6);
    stringBuffer.append(genModel.getGeneratorProjectTypeConstantName(projectType));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genPackage.getQuallifiedGenerateProjectTypeId(projectType));
    stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getGeneratorAdapterBaseClassName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.codegen.ecore.generator.GeneratorAdapterFactory"));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genModel.getImportedName(genModel.getGeneratorPluginClass()));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.codegen.jet.JETEmitter"));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.codegen.jet.JETException"));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genModel.getGeneratorPluginID());
    stringBuffer.append(TEXT_17);
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_18);
    return stringBuffer.toString();
  }
}
