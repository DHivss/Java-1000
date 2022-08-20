<h1 class="title">Эволюция (32%)</h1>
<p><a href="https://acmp.ru/index.asp?main=task&id_task=784" target="_blank">Ссылка на задачу</a></p>
<p><b>Время: 1 сек.<br>Память: 16 Мб<br>Сложность: 32%</b></p>
<p>Во время исследований, посвященных появлению жизни на планете Олимпия, учеными было сделано несколько сенсационных открытий:</p>
<ul>
    <li>Все живые организмы планеты происходят от бактерии Bitozoria Programulis.</li>
    <li>Эволюция происходила шаг за шагом (по предположению ученых – во время изменения климата на планете).</li>
    <li>На каждом шаге эволюции из каждого вида образовывались ровно два подвида, а предыдущий вид исчезал.</li>
    <li>Если считать появление бактерии Bitozoria Programulis первым шагом эволюции, то существующие сейчас живые организмы находятся на N-ом шаге.</li>
</ul>
<p>Чтобы не придумывать названия во время исследований, ученые пронумеровали все виды организмов, которые когда-либо существовали на планете. Для этого они нарисовали дерево эволюции с корнем Bitozoria Programulis, которая получила номер 1. Далее нумеровали виды каждого шага эволюции слева направо. Таким образом непосредственные подвиды Bitozoria Programulis получили номера 2 и 3. Следующими были занумерованы виды третьего шага эволюции – подвиды вида 2 получили номера 4 и 5, а вида 3 – номера 6 и 7, и т.д.</p>
<p>Напишите программу, которая по номерам двух видов вычислит номер вида их ближайшего общего предка в дереве эволюции.</p>
<h2>Формат ввода</h2>
<p class="text">
В первой строке входного файла INPUT.TXT записано целое число N (1 ≤ N ≤ 60) – количество этапов эволюции, которые произошли на планете Олимпия до текущего времени. Вторая и третья строки содержат по одному натуральному числу, которые представляют номера видов, для которых требуется найти номер их ближайшего общего предка.</p>
<h2>Формат вывода</h2>
<p class=text>
В выходной файл OUTPUT.TXT выведите одно натуральное число – номер ближайшего предка для двух видов.
</p>
<h3>Примеры</h3>
<table class="sample-tests">
  <thead>
     <tr>
        <th>Ввод</th>
        <th>Вывод</th>
     </tr>
  </thead>
  <tbody>
     <tr>
        <td>4<br>
            15<br>
            12</td>
        <td>3</td>
     </tr>
     <tr>
        <td>18<br>
            233016<br>
            233008</td>
        <td>14563</td>
     </tr>
  </tbody>
</table>