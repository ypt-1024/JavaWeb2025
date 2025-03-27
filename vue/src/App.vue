<script setup>
import HelloWorld from './components/HelloWorld.vue'
import Base from "./components/base.vue";
import Base1 from "./components/base1.vue";
import Base2 from "./components/base2.vue";
import Base3 from "./components/base3.vue";
</script>

<template>
  <Base3/>
</template>

<style scoped>
.logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
  transition: filter 300ms;
}
.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}
.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
</style>
