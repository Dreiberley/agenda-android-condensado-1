#!/bin/bash
echo "🚀 Configurando ambiente Android..."

# Dar permissão ao gradlew
chmod +x gradlew

# Testar Gradle
echo "✅ Verificando Gradle..."
./gradlew --version

# Build inicial
echo "🔨 Fazendo build do app..."
./gradlew assembleDebug

echo "🎉 Setup completo! APK em: app/build/outputs/apk/debug/"
